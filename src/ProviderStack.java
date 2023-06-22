public class ProviderStack {
    private Provider[] providers;
    private int index;

    public ProviderStack() {
        providers = new Provider[10];
        index = 0;
    }

    public int size() {
        return index;
    }

    public Provider getProviderAt(int index) {
        if (index >= 0 && index < this.index) {
            return providers[index];
        }
        return null;
    }

    public void pushProvider(Provider provider) {
        if (index >= providers.length) {
            Provider[] newArray = new Provider[providers.length * 2];
            for (int i = 0; i < providers.length; i++) {
                newArray[i] = providers[i];
            }
            providers = newArray;
        }
        providers[index++] = provider;
    }

    public Provider popProvider() {
        if (index == 0) {
            return null;
        }
        Provider provider = providers[--index];
        providers[index] = null;
        return provider.hasMovies() ? null : provider;
    }
}