package com.kathanparikh.animeworld.data;

import com.kathanparikh.animeworld.R;
import com.kathanparikh.animeworld.model.Anime;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private static List<Anime> animeList = new ArrayList<>();

    static {
        addProductsOnInitialization();
    }

    private ProductRepository() {
        //Private constructor
    }

    /**
     * Initialize list with number of products
     */
    public static void addProductsOnInitialization() {
        animeList.add(
                new Anime("ANIME_1",
                        "Dragon Ball Z",
                        "Dragon Ball is a Japanese media franchise created by Akira Toriyama in 1984. The series follows the adventures of the protagonist, Son Goku, from his childhood through adulthood as he trains in martial arts.  Along his journey, Goku makes several other friends, becomes a family man, discovers his alien heritage, and battles a wide variety of villains, many of whom also seek the Dragon Balls.",
                        "6 seasons and counting",
                        R.drawable.dragon_ball_z_banner,
                        R.drawable.dragon_ball_z_icon,
                        11.99,
                        4.8f,
                        1986));

        animeList.add(
                new Anime("ANIME_2",
                        "Naruto",
                        "Naruto is a Japanese manga series written and illustrated by Masashi Kishimoto. It tells the story of Naruto Uzumaki, a young ninja who seeks recognition from his peers and dreams of becoming the Hokage, the leader of his village. Naruto is the fourth best-selling manga series in history, selling 250 million copies worldwide in 46 countries. 153 million of the sales in Japan alone and remaining 97 million copies outside of Japan.",
                        "3 seasons",
                        R.drawable.naruto_banner,
                        R.drawable.naruto_icon,
                        9.99,
                        4.7f,
                        2007));

        animeList.add(
                new Anime("ANIME_3",
                        "One Piece",
                        "One Piece is a Japanese anime television series based on Eiichiro Oda's manga series of the same name. The story follows the adventures of Monkey D. Luffy, a boy whose body gained the properties of rubber after unintentionally eating a Devil Fruit. With his crew of pirates, named the Straw Hat Pirates, Luffy explores the Grand Line in search of the world's ultimate treasure known as 'One Piece' in order to become the next Pirate King.",
                        "949 episodes and counting",
                        R.drawable.one_piece_banner,
                        R.drawable.one_piece_icon,
                        7.99,
                        4.4f,
                        1999));

        animeList.add(
                new Anime("ANIME_4",
                        "Bleach",
                        "Bleach is a Japanese anime television series based on Tite Kubo's manga of the same name. It was produced by Studio Pierrot and directed by Noriyuki Abe. The series aired on TV Tokyo from October 2004 to March 2012, spanning 366 episodes. The story follows the adventures of Ichigo Kurosaki after he obtains the powers of a Soul Reaper—a death personification similar to the Grim Reaper—from another Soul Reaper, Rukia Kuchiki. His newfound powers force him to take on the duties of defending humans from evil spirits and guiding departed souls to the afterlife. The anime adaptation includes original storylines not found in the manga with repeated appearances and stories containing these original characters.",
                        "366 episodes and counting",
                        R.drawable.bleach_banner,
                        R.drawable.bleach_icon,
                        8.99,
                        4.2f,
                        2004));

        animeList.add(
                new Anime("ANIME_5",
                        "One Punch Man",
                        "One-Punch Man is a Japanese superhero franchise created by the artist ONE. It tells the story of Saitama, a superhero who can defeat any opponent with a single punch but seeks to find a worthy foe after growing bored by a lack of challenge due to his overwhelming strength. ONE wrote the original webcomic version in early 2009.",
                        "2 seasons",
                        R.drawable.one_punch_man_banner,
                        R.drawable.one_punch_man_icon,
                        6.99,
                        4.6f,
                        2015));

        animeList.add(
                new Anime("ANIME_6",
                        "My Hero Academia",
                        "My Hero Academia is a Japanese superhero manga series written and illustrated by Kōhei Horikoshi.  The story follows Izuku Midoriya, a boy born without superpowers (called Quirks) in a world where they have become commonplace, but who still dreams of becoming a superhero himself. He is scouted by All Might, Japan's greatest hero, who shares his Quirk with Midoriya after recognizing his potential, and later helps to enroll him in a prestigious high school for heroes in training.",
                        "88 episodes and counting",
                        R.drawable.my_hero_academia_banner,
                        R.drawable.my_hero_academia_icon,
                        12.99,
                        4.6f,
                        2016));

    }


    /**
     * Method to get the list of products
     *
     * @return list of products
     */
    public static List<Anime> getAnimeList() {
        return animeList;
    }
}
