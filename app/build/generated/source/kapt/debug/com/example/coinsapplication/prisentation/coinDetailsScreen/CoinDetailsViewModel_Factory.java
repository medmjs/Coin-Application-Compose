// Generated by Dagger (https://dagger.dev).
package com.example.coinsapplication.prisentation.coinDetailsScreen;

import androidx.lifecycle.SavedStateHandle;
import com.example.coinsapplication.domain.useCase.getCoinDetailsUseCase.CoinDetailsUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoinDetailsViewModel_Factory implements Factory<CoinDetailsViewModel> {
  private final Provider<CoinDetailsUseCase> coinDetailsUseCaseProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public CoinDetailsViewModel_Factory(Provider<CoinDetailsUseCase> coinDetailsUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.coinDetailsUseCaseProvider = coinDetailsUseCaseProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public CoinDetailsViewModel get() {
    return newInstance(coinDetailsUseCaseProvider.get(), savedStateHandleProvider.get());
  }

  public static CoinDetailsViewModel_Factory create(
      Provider<CoinDetailsUseCase> coinDetailsUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new CoinDetailsViewModel_Factory(coinDetailsUseCaseProvider, savedStateHandleProvider);
  }

  public static CoinDetailsViewModel newInstance(CoinDetailsUseCase coinDetailsUseCase,
      SavedStateHandle savedStateHandle) {
    return new CoinDetailsViewModel(coinDetailsUseCase, savedStateHandle);
  }
}
