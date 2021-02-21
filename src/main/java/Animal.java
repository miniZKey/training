public abstract class Animal {
    private int paws;
    private int tail;

    public static class Mammal extends Animal {
        private String fur;


        public static class Tiger extends Mammal {
            private int age;
            private int weight;
            private String name;


            public Tiger(String name, int age, int weight) {
                this.name = name;
                this.age = age;
                this.weight = weight;
            }

            public Tiger() {
            }

            public String getName() {
                return name;
            }

            public void setName() {
                this.name = name;
            }


            public void setAge(int age) {
                this.age = age;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }

            public int getAge() {
                return age;
            }

            public int getWeight() {
                return weight;
            }

            public String toString() {
                return name + " " + age + " " + weight + "";
            }
        }
    }
}
