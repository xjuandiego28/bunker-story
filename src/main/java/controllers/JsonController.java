package controllers;

import models.User;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class JsonController {
    public void createUser(User currentUser){
        try {
            File usersListFile = new File(".\\src\\main\\java\\resources\\data\\accounts.json");
            ArrayList<User> accountsList;
            
            if (!usersListFile.exists()) {
                accountsList = new ArrayList<>();
            } else {
                Gson gson = new Gson();
                Type listTypeUsers = new TypeToken<ArrayList<User>>(){}.getType();
                BufferedReader bufferedReader = new BufferedReader(new FileReader(usersListFile));
                accountsList = gson.fromJson(bufferedReader, listTypeUsers);
                bufferedReader.close();
            }
            
            accountsList.add(currentUser);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter writer = new FileWriter(usersListFile);
            gson.toJson(accountsList, writer);
            writer.close();
            
            System.out.println("Cuenta creada correctamente");
        } catch (IOException e) {
            System.err.println("Ocurrió el siguiente error al tratar de crear la cuenta: " + e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("Error: Ocurrió un error inesperado: " + e.getMessage());
        }
    }
   
    public boolean userExists(String userEmail, String userPassword) {
        File usersListFile = new File(".\\src\\main\\java\\resources\\data\\accounts.json");
        if (!usersListFile.exists()) {
            System.err.println("El archivo no existe");
            return false;
        }

        try {
            Gson gson = new Gson();
            Type listType = new TypeToken<ArrayList<User>>(){}.getType();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(usersListFile));
            ArrayList<User> accountsList = gson.fromJson(bufferedReader, listType);
            bufferedReader.close();

            for (User existingUser : accountsList) {
                if (existingUser.getEmail().equals(userEmail) &&
                    existingUser.getPassword().equals(userPassword)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Ocurrió el siguiente error al tratar de buscar la cuenta: " + e.getMessage());
        }
        return false;
    }
}

