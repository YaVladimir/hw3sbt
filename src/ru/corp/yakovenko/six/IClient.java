package ru.corp.yakovenko.six;

/**
 * Created by 2 on 04.09.2017.
 */
public interface IClient {
    String getGroupName();

    Integer getLoyalityLevel();

    /*void setGroupName(String groupName);*/

    void setLoyalityLevel(Integer loyalityLevel);
}
