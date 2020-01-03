package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.management.counter.LongArrayCounter;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    String x = "Hello, ";
    long id = 0;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "User") String name,
                             @RequestParam(value = "lastName", defaultValue = "User") String lastName) {
        return new Greeting(++id, x + name + " " + lastName + "!");
    }
}

//    private final AtomicLong counter = new AtomicLong();
//         return new Greeting(counter.incrementAndGet(), x + name + " " + lastName + "!");
// import sun.management.counter.LongArrayCounter;

