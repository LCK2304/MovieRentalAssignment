package za.ac.cput.factory;

import za.ac.cput.entity.userRole;

import java.util.UUID;

/**
 * Author: Muhammad Yaasin Cole
 * Student Number: 218340869
 *
 */

public class UserRoleFactory {

    public static userRole build(int userId , int roleId)
    {
        if( roleId <= 0 || userId<=0)
        {
            return null;
        }

        int roleID = Integer.parseInt(UUID.randomUUID().toString());
        int userID = Integer.parseInt(UUID.randomUUID().toString());

        return new userRole.userRoleBuilder()
                .setRoleId(roleID).setUserId(userID).build();
    }
}
