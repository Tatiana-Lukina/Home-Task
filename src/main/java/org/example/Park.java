package org.example;

class Park {
    private String parkName;
    private Attraction[] attractions;

    public Park(String parkName, int capacity) {
        this.parkName = parkName;
        this.attractions = new Attraction[capacity];
    }

    class Attraction {
        private String name;
        private String workingHours;
        public double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион:" + name);
            System.out.println("Время работы:" + workingHours);
            System.out.println("Стоимость:" + price);
            System.out.println();
        }

    }

    public void addAttraction(int index, String name, String workingHours, double price) {
        if (index >= 0 && index < attractions.length) {
            attractions[index] = new Attraction(name, workingHours, price);
        }
    }

    public void printAttractions() {
        System.out.println("Аттракционы в парке" + ":" + parkName);
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                attraction.printInfo();
            }
        }


    }
}

