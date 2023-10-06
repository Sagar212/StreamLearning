import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class StreamTrain {
	public static void main(String[] args) {
		List<String> countries = new ArrayList<String>();
		// System.out.println( countries );
		Customer d = new Customer();

		List<Customer> Customerldy =

				Arrays.asList(new Customer(1, " safar", "fe"), new Customer(2, " gafar", "ge"),
						new Customer(3, " ferry", "hr"), new Customer(4, null, "jy"));

		// countries.addAll(Arrays.asList("air","top","water"));
		List<String> countries2 = new ArrayList<String>();
		countries2.addAll(Arrays.asList("air", "top", "water", "air2", "top2", "water2"));

//	Customerldy.stream().forEach(System.out::println );

		Customerldy.stream().forEach(System.out::println);

		// countries.stream().map(String::toUpperCase).forEach(System.out::println);
// System.out.println(countries2.removeAll(Customerldy));

		for (Customer Customd : Optional.ofNullable(Customerldy).orElse(Collections.emptyList())) {
			System.out.println("g" + Customd.getFirstname());
		}
		// countries.stream().filter(a->a.startsWith("a")).filter(e->e.endsWith("r")).forEach(System.out::println);
		// Customerldy.stream().forEach(System.out::println);
		// Collections.reverseOrder(countries);
		// countries.stream().forEach(e->e.length()>2);

	}
}
