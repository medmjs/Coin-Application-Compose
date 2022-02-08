package com.example.coinsapplication.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/coinsapplication/domain/repository/CoinRepository;", "", "getCoinDetails", "Lcom/example/coinsapplication/data/remote/dto/CoinDetailsDto;", "coinId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoins", "", "Lcom/example/coinsapplication/data/remote/dto/CoinDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTwitter", "Lcom/example/coinsapplication/data/remote/dto/CoinTwitterDto;", "app_debug"})
public abstract interface CoinRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCoins(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.coinsapplication.data.remote.dto.CoinDto>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCoinDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.coinsapplication.data.remote.dto.CoinDetailsDto> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTwitter(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.coinsapplication.data.remote.dto.CoinTwitterDto>> continuation);
}