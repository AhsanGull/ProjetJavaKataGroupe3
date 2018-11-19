package sample;

public  class Inventory {

    private Item[] items;
    private java.lang.String SULFURA_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    private java.lang.String ELEXIR_OF_THE_MONGOOSE = "Elixir of the Mongoose";
    private java.lang.String AGED_BRIE = "Aged Brie";
    private java.lang.String CONJURED_MANA_CAKE = "Conjured Mana Cake";
    private java.lang.String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    private java.lang.String DEXTERITY_VEST = "+5 Dexterity Vest";
    public Inventory(Item[] items) {
        super();
        this.items = items;
    }

    public Inventory() {
        items = new Item[]{
                new Item(DEXTERITY_VEST, 10, 20),
                new Item(AGED_BRIE, 2, 0),
                new Item(ELEXIR_OF_THE_MONGOOSE, 5, 7),
                new Item(SULFURA_HAND_OF_RAGNAROS, 0, 80),
                new Item(BACKSTAGE, 15, 20),
                new Item(CONJURED_MANA_CAKE, 3, 6)
        };

    }

    public void printInventory() {
        System.out.println("***************");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("***************");
        System.out.println("\n");
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++)
        {
            if (!items[i].getName().equals(SULFURA_HAND_OF_RAGNAROS) ) {
                if (!items[i].getName().equals(AGED_BRIE)  && !items[i].getName().equals(BACKSTAGE) ) {
                    if (items[i].getQuality() > 0) {
                        items[i].setQuality(items[i].getQuality() - 1);
                    }
                } else {
                    if (items[i].getQuality() < 50) {
                        items[i].setQuality(items[i].getQuality() + 1);
                        if (items[i].getName().equals(BACKSTAGE) ) {
                            if (items[i].getSellIn() < 11 && items[i].getQuality() < 50) {
                                items[i].setQuality(items[i].getQuality() + 1);
                            }
                            if (items[i].getSellIn() < 6 && items[i].getQuality() < 50) {
                                items[i].setQuality(items[i].getQuality() + 1);
                            }
                        }
                    }
                }
                items[i].setSellIn(items[i].getSellIn() - 1);
                if (items[i].getSellIn() < 0) {
                    if (!items[i].getName().equals(AGED_BRIE) ) {
                        if (!items[i].getName().equals(BACKSTAGE)) {
                            if (items[i].getQuality() > 0) {
                                items[i].setQuality(items[i].getQuality() - 1);
                            }
                        } else {
                            items[i].setQuality(0);
                        }
                    } else {
                        if (items[i].getQuality() < 50) {
                            items[i].setQuality(items[i].getQuality() + 1);
                        }
                    }
                }
            }
        }
    }
}
