package com.training.restapi.Dao;

import com.training.restapi.Model.UserModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDao {

    public static ArrayList<UserModel> users = new ArrayList<>();

    static {
        users.add(new UserModel(123,"Hailong","Biden&Harris",new Date()));
        users.add(new UserModel(456,"Vineeth","Cannada",new Date()));
        users.add(new UserModel(789,"Manuel","Chicago",new Date()));
    }



    //retrieve all users
    public List<UserModel> retrieveAllUsers(){
        return users;
    }

    //retrieve User by UserId
    public UserModel retrieveUserByUserId(int id) {
       return users.get(id);
    }

    //create a user
    public void createUser(UserModel input_user){
        users.add(input_user);
    }


}
