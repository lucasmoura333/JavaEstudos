public class Item {

    private String tipo;
    private String lanche;
    private double preco;
    private String tamanho = "MEDIO";


    public Item(String tipo, String lanche, double preco) {
        this.tipo = tipo.toUpperCase();
        this.lanche = lanche.toUpperCase();
        this.preco = preco;
    }

    public String getLanche() {
        if (tipo.equals("EXTRA") || tipo.equals("BEBIDA")){
            return tamanho + " " + lanche;
        }
        return lanche;
    }

    public double getPrecoBase() {
        return preco;
    }

    public double getPrecoAjustado(){
        return switch (tamanho){
            case "PEQUENO" -> getPrecoBase() - 0.5;
            case "GRANDE" -> getPrecoBase() + 1;
            default -> getPrecoBase();
        };
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public static void printItem(String lanche, double preco){
        System.out.printf("%20s:%6.2f%n", lanche, preco);
    }

    public void printItem(){
        printItem(getLanche(), getPrecoAjustado());
    }
}
