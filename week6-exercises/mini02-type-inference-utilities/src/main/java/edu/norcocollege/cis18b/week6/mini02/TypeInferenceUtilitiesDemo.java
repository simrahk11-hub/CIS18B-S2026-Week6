package edu.norcocollege.cis18b.week6.mini02;

public class TypeInferenceUtilitiesDemo 
{

    // generic pair factory method
    public static <L, R> Pair<L, R> pair(L left, R right) 
    {
        return new Pair<>(left, right); 
    }

    // - chooses second
    public static <T> T chooseSecond(T first, T second) 
    {
        return second;
    }

    public static <T> T chooseNonNull(T first, T second) 
    {
        if (first != null) 
        {
            return first;
        }
        if (second != null) 
        {
            return second;
        }
        throw new IllegalArgumentException("Both values are null");
    }

    public static void main(String[] args) 
    {

        // type inference determines <String, Integer>
        Pair<String, Integer> studentScore = pair("Ada", 98);

        String secondName = chooseSecond("Ada", "Grace");

        // explicit type argument 
        String explicitValue = TypeInferenceUtilitiesDemo.<String>chooseSecond(null, "fallback");

        // output
        System.out.println("Pair: " + studentScore);
        System.out.println("Second name: " + secondName);
        System.out.println("Explicit value: " + explicitValue);
    }
}
