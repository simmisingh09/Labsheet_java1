// 14. Person
class Person14 {
    String name;
    int age;
    static String country = "India";

    void checkVotingEligibility() {
        String personName = name;
        int personAge = age;

        System.out.println("Name: " + personName);
        System.out.println("Age: " + personAge);
        System.out.println("Country: " + country);

        if (personAge >= 18)
            System.out.println("Eligible for voting");
        else
            System.out.println("Not eligible for voting");
    }
}
