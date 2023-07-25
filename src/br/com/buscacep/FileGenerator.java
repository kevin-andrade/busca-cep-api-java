package br.com.buscacep;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {

    public void saveJson(Address address) throws IOException {
        Gson gson = new Gson().newBuilder()
                .setPrettyPrinting()
                .create();

        FileWriter writing = new FileWriter(address.cep() + ".json");
        writing.write(gson.toJson(address));
        writing.close();
    }
}
