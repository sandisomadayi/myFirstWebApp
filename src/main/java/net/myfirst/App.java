package net.myfirst;

import spark.Spark;

public class App {

    public static void main(String[] args) {
        Spark.staticFiles.location("/public"); // Static files
        Spark.get("/greet", (req, res) -> "Molo!");

        Spark.get("/greet/:name", (req, res) -> {
            return "Molo " + req.params("name");
        });
        Spark.get("/greet/:name/language/:language", (req, res) -> {
            return Lang.valueOf(req.params("language")).getLang() + " " + req.params("name");
        });
//        Spark.post("/greet", (req, res) -> {
//            return req.que
//        });
    }
}