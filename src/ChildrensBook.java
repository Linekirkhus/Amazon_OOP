public class ChildrensBook extends Book{

    private String recommendedAgeInfo = "from 4 years";

    public ChildrensBook( String title, String author, int price, long productId, String recommendedAgeInfo) {
        super(title, author, price, productId);
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    public String getRecommendedAgeInfo() {
        return recommendedAgeInfo;
    }

    public void setRecommendedAgeInfo(String recommendedAgeInfo) {
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    @Override
    public String toString() {
        return "Children's Book: " +
                "\nRecommended Age Info: '" + recommendedAgeInfo +
                "\nPrice: " + price +
                "\nProductId: " + productId;
    }
    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("The recommended age limit for this book is: " + this.recommendedAgeInfo);

    }
}
