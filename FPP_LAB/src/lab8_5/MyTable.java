package lab8_5;

public class MyTable {
    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b', "Billy");
        t.add('w', "Willie");
        System.out.println(t);
        System.out.println(t.get('w'));
        System.out.println(t.get('m'));
    }

    public static final int INDEX_ZERO_CHAR_VALUE = 97;
    private Entry[] entries;

    public MyTable() {
        this.entries = new Entry[26];
    }

    //returns the String that is matched with char c in the table
    public String get(char c) {
        //implement
        int position = c - INDEX_ZERO_CHAR_VALUE;
        if (position < 0 || position > entries.length - 1) throw new ArrayIndexOutOfBoundsException();
        Entry e = entries[position];
        if (entries[position] == null) return "not found i.e. null";
        return e.str;
    }

    //adds to the table a pair (c, s) so that s can be looked up using c
    public void add(char c, String s) {
        //implement
        int position = c - INDEX_ZERO_CHAR_VALUE; // a = 97 so a - a = 0 index and so on
        if (position < 0 || position > entries.length - 1) throw new ArrayIndexOutOfBoundsException();

        Entry insert = new Entry(s, c);
        entries[position] = insert;
    }

    //returns a String consisting of nicely formatted display
    //of the contents of the table
    public String toString() {
        //implement
        StringBuilder sb = new StringBuilder();
        for (Entry e : entries) {
            if (e != null) {
                sb.append(e).append("\n");
            }
        }
        return sb.toString();
    }


    private class Entry {
        private char ch;
        private String str;

        Entry(String str, char ch) {
            //implement
            this.ch = ch;
            this.str = str;
        }

        //returns a String of the form "ch->str"
        public String toString() {
            //implement
            return String.format("%s->%s", this.ch, this.str);
        }
    }

}