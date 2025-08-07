package Services;

import Entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService
{
    public static void registerUser(List<User> users,User user)
    {
        for(User user1 : users)
        {
            if(user1.getUserid()==user.getUserid())
            {
                System.out.println("User Already added");
                return;
            }
        }
        System.out.println("User Added Successfully");
        users.add(user);
        return;
    }

    public static void updateuser(List<User> users,int userid)
    {
        for(User user : users)
        {
            if(user.getUserid()==userid)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the fields with new values");
                System.out.println("Enter new username");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Enter new Department");
                String depar = sc.nextLine();
                System.out.println("Enter new Contact Number");
                Long cont = sc.nextLong();
                user.setUsername(name);
                user.setDepartment(depar);
                user.setContactno(cont);
                return ;
            }
        }
        System.out.println("No user found with this id");
        return ;
    }
    public static List<User> deleteuser(List<User> users,int userid)
    {
        for(User user:users)
        {
            if(user.getUserid()==userid)
            {
                users.remove(user);
                return users;
            }
        }
        System.out.println("No user found with this id");
        return users;
    }
    public static boolean searchuser(List<User> users,int id)
    {
        if(users.isEmpty())
        {
            //System.out.println("No user found");
            return false;
        }
        for(User user : users)
        {
            if(user.getUserid()==id)
                return true;
        }
        return false;
    }
}
