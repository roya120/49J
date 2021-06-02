package com.company;

public class Cards {

    String card;


    public Cards(String newCard) {


        card = newCard;

    }

    public String getDescription() {

        String description;

        if (card.charAt(0) == 'A' || card.charAt(0) == 'a') {
            description = "Ace";

        }
        else {
            switch (card.charAt(0)) {
                case '2':
                    description = "Two";
                    break;
                case '3':
                    description = "Three";
                    break;
                case '4':
                    description = "Four";
                    break;
                case '5':
                    description = "Five";
                    break;
                case '6':
                    description = "Six";
                    break;
                case '7':
                    description = "Seven";
                    break;
                case '8':
                    description = "Eight";
                    break;

                case '9':
                    description = "Nine";
                    break;

                case 'J':
                case 'j':
                    description = "Jack";
                    break;

                case 'Q':
                case 'q':
                    description = "Queen";
                    break;

                case 'K':
                case 'k':
                    description = "King";
                    break;

                default:
                    description = "Unknown";

                    break;

            }
        }
        if (description != "Unknown") {

            switch (card.charAt(card.length() - 1)) {

                case 'D':
                case 'd':

                    description = description + " of Diamonds";
                    break;

                case 'S':
                case 's':

                    description = description + " of Spades";
                    break;

                case 'C':
                case 'c':
                    description = description + " of Clubs";
                    break;

                case 'H':
                case 'h':

                    description = description + " of Hearts";

                    break;

                default:
                    description = "Unknown";

                    break;


            }

        }

        return description;
    }

}
