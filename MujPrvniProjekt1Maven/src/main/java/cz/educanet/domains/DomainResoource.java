package cz.educanet.domains;

import com.sun.tools.javac.util.ArrayUtils;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.*;
import java.util.stream.Collectors;

@Path("domains") // localhost:8080/MujPrvniProjektMaven/api/pathname
@Produces(MediaType.APPLICATION_JSON)
public class DomainResoource {

    public String input =
            "\"1\";\"AltaVista.com\";\"$3,300,000\";\"1998\"\n" +
                    "\"2\";\"Asseenontv.com\";\"$5,100,000\";\"2000\"\n" +
                    "\"3\";\"Beer.com\";\"$7,000,000\";\"2004\"\n" +
                    "\"4\";\"Business.com\";\"$7,500,000\";\"1999\"\n" +
                    "\"5\";\"Candy.com\";\"$3,000,000\";\"1009\"\n" +
                    "\"6\";\"Casino.com\";\"$5,500,000\";\"2003\"\n" +
                    "\"7\";\"Clothes.com\";\"$4,900,000\";\"2008\"\n" +
                    "\"8\";\"Diamond.com\";\"$7,500,000\";\"2006\"\n" +
                    "\"9\";\"Fb.com\";\"$8,500,000\";\"2010\"\n" +
                    "\"10\";\"Fund.com\";\"£9,990,000\";\"2008\"\n" +
                    "\"11\";\"GiftCard.com\";\"$4,000,000\";\"2012\"\n" +
                    "\"12\";\"Hotels.com \";\"$11,000,000\";\"2001\"\n" +
                    "\"13\";\"iCloud.com\";\"$6,000,000\";\"2011\"\n" +
                    "\"14\";\"IG.com\";\"$4,600,000\";\"2013\"\n" +
                    "\"15\";\"Insurance.com \";\"$35,600,000\";\"2010\"\n" +
                    "\"16\";\"Insure.com \";\"$16,000,000\";\"2009\"\n" +
                    "\"17\";\"Internet.com \";\"$18,000,000\";\"2009\"\n" +
                    "\"18\";\"Loans.com\";\"$3,000,000\";\"2000\"\n" +
                    "\"19\";\"Medicare.com\";\"$4,800,000\";\"2014\"\n" +
                    "\"20\";\"Mi.com\";\"$3,600,000\";\"2014\"\n" +
                    "\"21\";\"Porn.com\";\"$9,500,000\";\"2007\"\n" +
                    "\"22\";\"PrivateJet.com \";\"$30,100,000\";\"2012\"\n" +
                    "\"23\";\"Sex.com\";\"$14,000,000\";\"2010\"\n" +
                    "\"24\";\"Slots.com \";\"$5,500,000\";\"2010\"\n" +
                    "\"25\";\"Toys.com\";\"$5,100,000\";\"2009\"\n" +
                    "\"26\";\"VacationRentals.com \";\"$35,000,000\";\"2007\"\n" +
                    "\"27\";\"Whisky.com\";\"$3,100,000\";\"2013\"\n" +
                    "\"28\";\"Yp.com\";\"$3,800,000\";\"2008\"\n";

    Domain domain;
    public double averageFinal = 0;
    public double maxPrice = 0;
    public double minPrice = 0;
    public double average = 0;
    public double number = 0;
    public List<Double> all = new ArrayList<>();

    public void start() {
        String[] inputSplit = input.split("\n");

        for (int i = 0; i < inputSplit.length; i++) {
            String[] p = inputSplit[i].split(";");

            String good2 = p[2].replace("\"", "").replace(",", "");
            String good = good2.substring(1, good2.length());

            double number = Double.parseDouble(good);
            average += number;
            if (number > maxPrice){
                maxPrice = number;
            }
            all.add(number);
        }
        minPrice = all.get(0);
        for (int i = 1; i < all.size(); i++) {
            if (all.get(i) < minPrice) {
                minPrice = all.get(i);
            }
        }

        averageFinal = average / inputSplit.length;
       Arrays.sort(all.stream().toArray());

        domain = new Domain((int)(Math.round( averageFinal / 1000) * 1000), maxPrice,minPrice);
    }

    @GET
    public Response getAllClubs() {
        start();
        return Response.ok(domain
        ).build();
    }
}
