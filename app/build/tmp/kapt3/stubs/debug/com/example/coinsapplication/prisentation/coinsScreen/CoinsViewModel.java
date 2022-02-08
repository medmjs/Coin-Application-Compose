package com.example.coinsapplication.prisentation.coinsScreen;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/example/coinsapplication/prisentation/coinsScreen/CoinsViewModel;", "Landroidx/lifecycle/ViewModel;", "coinsUseCase", "Lcom/example/coinsapplication/domain/useCase/getCoinsUseCase/CoinsUseCase;", "(Lcom/example/coinsapplication/domain/useCase/getCoinsUseCase/CoinsUseCase;)V", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/example/coinsapplication/domain/model/coins/CoinsState;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "getCoins", "", "app_debug"})
public final class CoinsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.coinsapplication.domain.useCase.getCoinsUseCase.CoinsUseCase coinsUseCase = null;
    private androidx.compose.runtime.MutableState<com.example.coinsapplication.domain.model.coins.CoinsState> _state;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.example.coinsapplication.domain.model.coins.CoinsState> state = null;
    
    @javax.inject.Inject()
    public CoinsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.coinsapplication.domain.useCase.getCoinsUseCase.CoinsUseCase coinsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.example.coinsapplication.domain.model.coins.CoinsState> getState() {
        return null;
    }
    
    private final void getCoins() {
    }
}