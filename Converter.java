import java.util.*;
public class Converter {
	public static void main(String[] args) {
		Kmtm k = (float km) -> {
			return km / 1.609f;
		};
		System.out.println("1km is = " + k.convert(1) + " miles");
		Ftc ftc = (float f) -> {
			return ((f - 32) * 5) / 9;
		};
		System.out.println("1 degree fahrenheit is = " + ftc.convert(1) + " degrees celsius");
	}
}

interface Kmtm {
	public float convert(float f);
}

interface Ftc {
	public float convert(float f);
}
