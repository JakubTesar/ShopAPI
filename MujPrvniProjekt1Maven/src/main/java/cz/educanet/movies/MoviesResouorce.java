package cz.educanet.movies;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;
import cz.educanet.domains.Domain;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Path("movies") // localhost:8080/MujPrvniProjektMaven/api/pathname
@Produces(MediaType.APPLICATION_JSON)
public class MoviesResouorce {

    public String input =
            "1911\n" +
                    "A Monster in Paris\n" +
                    "A Very Long Engagement\n" +
                    "Alatriste\n" +
                    "Apocalypto\n" +
                    "Arn: The Knight Templar\n" +
                    "Arsène Lupin\n" +
                    "Astérix : Le Domaine des dieux 3D\n" +
                    "Asterix 1\n" +
                    "Asterix 2\n" +
                    "Asterix 3\n" +
                    "Asterix 4\n" +
                    "Baarìa\n" +
                    "Beauty and the Beast\n" +
                    "Bon Voyage\n" +
                    "Che\n" +
                    "Chennai Express\n" +
                    "Crimson Rivers II: Angels of the Apocalypse\n" +
                    "Curse of the Golden Flower\n" +
                    "D-War\n" +
                    "Dhoom 3\n" +
                    "Dragon Blade\n" +
                    "Empire of the Wolves\n" +
                    "Enthiran\n" +
                    "Fanfan La Tulipe\n" +
                    "Gantz & Gantz: Perfect Answer\n" +
                    "Gervaise\n" +
                    "Hero\n" +
                    "Iceman\n" +
                    "Jappeloup\n" +
                    "Kong - The Origin\n" +
                    "La Vérité si je mens ! 3\n" +
                    "Largo Winch\n" +
                    "Largo Winch 2\n" +
                    "Le deuxième souffle\n" +
                    "Les Dalton\n" +
                    "Mesrine: L'Instinct De Mort & Mesrine: L'Ennemi Public N°1\n" +
                    "Michel Vaillant\n" +
                    "Nomad\n" +
                    "Nothing to Declare\n" +
                    "Paris 36\n" +
                    "Pinocchio\n" +
                    "Ponyo\n" +
                    "Pourquoi j'ai (pas) mangé mon père\n" +
                    "Ra.One\n" +
                    "Red Cliff\n" +
                    "Sky Fighters\n" +
                    "Supercondriaque\n" +
                    "Sur la piste du Marsupilami\n" +
                    "The Barber of Siberia\n" +
                    "The Battle of Neretva\n" +
                    "The Crossing\n" +
                    "The Extraordinary Adventures of Adèle Blanc-Sec\n" +
                    "The Flowers of War\n" +
                    "The Flying Swords of Dragon Gate\n" +
                    "The Grandmaster\n" +
                    "The Inhabited Island\n" +
                    "The Legend of Zu\n" +
                    "The Monkey King\n" +
                    "The Passion of the Christ\n" +
                    "The Promise\n" +
                    "The Stone Council\n" +
                    "The Tale of Princess Kaguya\n" +
                    "The Tiger and the Snow\n" +
                    "The Tiger Brigades\n" +
                    "The Warlords\n" +
                    "Treasured Island\n" +
                    "Un plan parfait\n" +
                    "War and Peace\n" +
                    "Wonderful Days\n" +
                    "Zhong Kui: Snow Girl and the Dark Crystal\n";

    public List<String>[] array = new List[5];

    public void start() {
        String[] inputSplit = input.split("\n");
        int a = 0;
        for (int i = 0; i < 5; i++) {
            array[i] = new ArrayList<String>();
            for (int j = 0; j < 16; j++) {
                if (i > 0 && a < inputSplit.length){
                    array[i].add(inputSplit[(16*i)+j]);
                }else if (i == 0){
                    array[i].add(inputSplit[j]);
                }
                a++;
            }
        }
    }

    @GET
    public Response getAllClubs() {
        start();
        return Response.ok(array).build();
    }
}

