package ru.corp.yakovenko.six;

/**
 * Created by 2 on 04.09.2017.
 */
public class Client extends Person implements IClient {
    private final String groupName;
    private Integer loyalityLevel;

    @Override
    public String getGroupName() {
        return groupName;
    }

   /* @Override
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }*/

    @Override
    public Integer getLoyalityLevel() {
        return loyalityLevel;
    }

    @Override
    public void setLoyalityLevel(Integer loyalityLevel) {
        this.loyalityLevel = loyalityLevel;
    }

    @Override
    public String toString() {
        return "Client{[" + super.toString() + "] " +
                "groupName='" + groupName + '\'' +
                ", loyalityLevel=" + loyalityLevel +
                '}';
    }

    public Client(String groupName, Integer loyalityLevel) {

        this.groupName = groupName;
        this.loyalityLevel = loyalityLevel;
    }

    private String getFullName() {
        return this.groupName + " " + this.getLoyalityLevel();
    }
}

