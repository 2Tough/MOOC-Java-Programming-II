/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.HashMap;

/**
 *
 * @author Valentin
 */
public class SaveableDictionary {

    private HashMap<String, String> translation;
    private String file;

    public SaveableDictionary() {
        this.translation = new HashMap();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public void add(String word, String translation) {
        if (this.translation.containsKey(word)) {
            return;
        }
        this.translation.put(word, translation);
        this.translation.put(translation, word);
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(this.file))
                    .map(val -> val.split(":"))
                    .forEach(parts -> {
                        this.translation.put(parts[0], parts[1]);
                        this.translation.put(parts[1], parts[0]);
                    });
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String translate(String word) {
        return this.translation.get(word);
    }

    public void delete(String word) {
        String value = translate(word);

        this.translation.remove(word);
        this.translation.remove(value);

    }

    public boolean save() {
        HashMap<String, String> list = new HashMap();
        
        try {
            PrintWriter writer = new PrintWriter(this.file);
            

            this.translation.keySet().stream()
                    .map(val -> this.translation.get(val))
                    .forEach(arg -> {
                        if (list.containsKey(translate(arg))) {
                            return;
                        } else {
                            list.put(arg, translate(arg));
                        writer.println(arg + ":" + list.get(arg));
                        }
                        
                        
                    });
            
            writer.close();
            return true;
        } catch (Exception e) {
            System.out.println("There is an error m8");
            return false;
        }

    }
}
