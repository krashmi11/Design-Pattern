public class ChannelRepo implements Container {

    private String[] channels = { "NGeo", "Discovery", "History", "ABP" };

    @Override
    public Iterator getIterator() {
        return new ChannelIterator();

    }

    private class ChannelIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index >= channels.length) {
                return false;
            }
            return true;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return channels[index++];
            }
            return null;
        }

    }

}
