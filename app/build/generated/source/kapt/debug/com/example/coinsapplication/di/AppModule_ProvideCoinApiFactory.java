// Generated by Dagger (https://dagger.dev).
package com.example.coinsapplication.di;

import com.example.coinsapplication.data.CoinApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideCoinApiFactory implements Factory<CoinApi> {
  @Override
  public CoinApi get() {
    return provideCoinApi();
  }

  public static AppModule_ProvideCoinApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoinApi provideCoinApi() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideCoinApi());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideCoinApiFactory INSTANCE = new AppModule_ProvideCoinApiFactory();
  }
}