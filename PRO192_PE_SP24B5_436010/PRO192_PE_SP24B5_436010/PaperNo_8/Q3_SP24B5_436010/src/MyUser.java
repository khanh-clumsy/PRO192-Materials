
import java.util.Collections;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class MyUser implements IUser {

    @Override
    public int f1(List<User> t) {
        int max = Integer.MIN_VALUE;
        for (User user : t) {
            if (Character.isDigit(user.getName().charAt(1))) {
                if (user.getStatus() > max) {
                    max = user.getStatus();
                }
            }
        }
        return max;
    }

    @Override
    public void f2(List<User> t) {
        List<User> newList = t.subList(3, 6);
        Collections.reverse(newList);
    }

    @Override
    public void f3(List<User> t) {
        User max = t.get(0);
        User firstElement = t.get(0);
        for (User user : t) {
            if (user.getStatus() > max.getStatus()) {
                max = user;
            }
        }
        firstElement.setName(max.getName());
        firstElement.setStatus(max.getStatus());
    }

}
