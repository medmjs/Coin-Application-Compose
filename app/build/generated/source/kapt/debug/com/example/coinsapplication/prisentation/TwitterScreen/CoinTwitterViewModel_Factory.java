// Generated by Dagger (https://dagger.dev).
package com.example.coinsapplication.prisentation.TwitterScreen;

import androidx.lifecycle.SavedStateHandle;
import com.example.coinsapplication.domain.useCase.getTwitterUseCase.GetTwitterUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoinTwitterViewModel_Factory implements Factory<CoinTwitterViewModel> {
  private final Provider<GetTwitterUseCase> getTwitterUseCaseProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public CoinTwitterViewModel_Factory(Provider<GetTwitterUseCase> getTwitterUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.getTwitterUseCaseProvider = getTwitterUseCaseProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public CoinTwitterViewModel get() {
    return newInstance(getTwitterUseCaseProvider.get(), savedStateHandleProvider.get());
  }

  public static CoinTwitterViewModel_Factory create(
      Provider<GetTwitterUseCase> getTwitterUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new CoinTwitterViewModel_Factory(getTwitterUseCaseProvider, savedStateHandleProvider);
  }

  public static CoinTwitterViewModel newInstance(GetTwitterUseCase getTwitterUseCase,
      SavedStateHandle savedStateHandle) {
    return new CoinTwitterViewModel(getTwitterUseCase, savedStateHandle);
  }
}
