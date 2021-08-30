package com.example.MainBank;
import com.mongodb.*;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.*;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;

public class MongoDBGetCon {
    private String MongoURI = "mongodb+srv://bankuser:bankuser@mainbank.em7vs.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
    MongoClient client ;
    public MongoClient getClient() {
         client = MongoClients.create(MongoURI);
        return client;
    }


    public MongoDatabase getDatabase( MongoClient client ){
        MongoDatabase database = client.getDatabase("banking");
        return database ;
    }

}
