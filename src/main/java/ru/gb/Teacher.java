package ru.gb;

public class Teacher {
        protected String firstName;
        protected String lastName;
        protected String surName;

        public Teacher(String firstName, String lastName, String surName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.surName = surName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getSurName() {
            return surName;
        }

        public void setSurName(String surName) {
            this.surName = surName;
        }

        @Override
        public String toString() {
            return "Teacher{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", surName='" + surName + '\'' +
                    '}';
        }
}

