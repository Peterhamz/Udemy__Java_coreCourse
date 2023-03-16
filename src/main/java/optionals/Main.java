package optionals;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        Object value = Optional.ofNullable(null).orElseGet(() ->"default value");
//
//        System.out.println(value);
//        Object valueS = Optional.ofNullable(null)
//                .orElseThrow(() ->new IllegalStateException("Exception"));

        //System.out.println(valueS);
                        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("sending email to "+email),
                        ()-> System.out.println("cant send email"));

    }
}
