package com.example.coinsapplication.prisentation.coinDetailsScreen;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0015"}, d2 = {"Lcom/example/coinsapplication/prisentation/coinDetailsScreen/CoinDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "coinDetailsUseCase", "Lcom/example/coinsapplication/domain/useCase/getCoinDetailsUseCase/CoinDetailsUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/example/coinsapplication/domain/useCase/getCoinDetailsUseCase/CoinDetailsUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/example/coinsapplication/domain/model/CoinDetailsState;", "arg", "", "getArg", "()Ljava/lang/String;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "getCoinDetails", "", "coinId", "app_debug"})
public final class CoinDetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.coinsapplication.domain.useCase.getCoinDetailsUseCase.CoinDetailsUseCase coinDetailsUseCase = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private androidx.compose.runtime.MutableState<com.example.coinsapplication.domain.model.CoinDetailsState> _state;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.example.coinsapplication.domain.model.CoinDetailsState> state = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String arg = null;
    
    @javax.inject.Inject()
    public CoinDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.coinsapplication.domain.useCase.getCoinDetailsUseCase.CoinDetailsUseCase coinDetailsUseCase, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.example.coinsapplication.domain.model.CoinDetailsState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArg() {
        return null;
    }
    
    public final void getCoinDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
    }
}