package com.example.a_new_hope;
import java.io.*;
import java.net.*;
import java.net.http.*;
import org.json.JSONArray;

import org.json.JSONObject;
import java.lang.reflect.Array;

public class Api {
    static Api instance;

    public static Api getInstance(){
        if(instance != null){
            return instance;
        }
        else{
            instance = new Api();
            return instance;
        }
    }
    public String[] nave(String name){
        String[] dato = new String[5];
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(URI.create("https://swapi.dev/api/starships/?search=" + name)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject obj = new JSONObject(response.body());
            obj = obj.getJSONArray("results").getJSONObject(0);

            dato[0] = obj.getString("cost_in_credits");
            dato[1] = obj.getString("passengers");
            dato[2] = obj.getString("cargo_capacity");
            dato[3] = obj.getString("hyperdrive_rating");
            dato[4] = obj.getString("MGLT");

        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        } catch (InterruptedException e) {
            // error
        }

        return dato;
    }

    public String[] transporte(String name){
        String[] dato = new String[3];
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(URI.create("https://swapi.dev/api/vehicles/?search=" + name)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject obj = new JSONObject(response.body());
            obj = obj.getJSONArray("results").getJSONObject(0);

            dato[0] = obj.getString("cost_in_credits");
            dato[1] = obj.getString("passengers");
            dato[2] = obj.getString("cargo_capacity");

        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        } catch (InterruptedException e) {
            // error
        }

        return dato;
    }
}
