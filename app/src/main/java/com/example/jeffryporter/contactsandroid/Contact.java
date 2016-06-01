package com.example.jeffryporter.contactsandroid;

import java.util.ArrayList;

/**
 * Created by jeffryporter on 6/1/16.
 */
public class Contact
{
    private String name;
    private String phone;
    private ArrayList<String> activities;

    public Contact(String name, String phone)
    {
        this.name = name;
        switch(phone.length())
        {
            case 7:
                this.phone = String.format("%s%s%s.%s%s%s%s",phone.charAt(0), phone.charAt(1), phone.charAt(2),
                         phone.charAt(3), phone.charAt(4), phone.charAt(5), phone.charAt(6));
                break;
            case 10:
                this.phone = String.format("%s%s%s.%s%s%s.%s%s%s%s",phone.charAt(0), phone.charAt(1), phone.charAt(2),
                        phone.charAt(3), phone.charAt(4), phone.charAt(5), phone.charAt(6), phone.charAt(7),
                        phone.charAt(8), phone.charAt(9));
                break;
            case 11:
                this.phone = String.format("%s.%s%s%s.%s%s%s.%s%s%s%s",phone.charAt(0), phone.charAt(1), phone.charAt(2),
                        phone.charAt(3), phone.charAt(4), phone.charAt(5), phone.charAt(6), phone.charAt(7),
                        phone.charAt(8), phone.charAt(9), phone.charAt(10));
                break;
            default:
                this.phone = phone;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<String> getActivities() {
        return activities;
    }

    public void setActivities(ArrayList<String> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s", name, phone);
    }
}
