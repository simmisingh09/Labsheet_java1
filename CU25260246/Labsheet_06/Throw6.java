// Q6. Using throw

// Q6. Using throw

class Throw6 {

    public static void main(String[] args) {

        int marks = 105;

        try {

            if (marks < 0 || marks > 100) {

                throw new IllegalArgumentException(
                    "Marks must be between 0 and 100."
                );
            }

            System.out.println("Valid marks: " + marks);

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
