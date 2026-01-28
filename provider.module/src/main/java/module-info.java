module provider.module {

    requires api.module;
    exports com.provider;
    provides com.exemple.GreetingManager with com.provider.GreetingIml;
}