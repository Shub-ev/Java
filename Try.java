class Try {
    public static void main(String args[]) {
        byte b = -1;
        for(int i = 0; i < 8; i++){
            System.out.println(b);
            b = (byte) (b >> 1);
        }
    }
}