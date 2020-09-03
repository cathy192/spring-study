package service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class userService {

    public  void main(String[] args){
        HashSet<String> names = new HashSet<String>();
        String users;
        Scanner sc = new Scanner(System.in);
        System.out.println("사용자 이름을 입력하시오");
        users=sc.next();
        names = Stringtoken(users);


    }
    public static HashSet<String> Stringtoken(String list){
        StringTokenizer st= new StringTokenizer(list,",");
        HashSet<String> set = new HashSet<String>();
        while(st.hasMoreTokens()){
            String next;
            next=st.nextToken();
        //    nameTest.DuplicateTest(next, set);

            set.add(next);
        }
        return set;
    }
}

