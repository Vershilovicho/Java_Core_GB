package ru.gb;
public class BiologyTeacher extends Teacher {

        public BiologyTeacher(String lName, String fName, String surName) {
            super(lName, fName, surName);
        }

        @Override
        public String toString() {
            return "BiologyTeacher{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", surName='" + surName + '\'' +
                    '}';
        }
}


