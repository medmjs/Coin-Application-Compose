package com.example.coinsapplication.domain.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0007H\u00d6\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001e"}, d2 = {"Lcom/example/coinsapplication/domain/model/CoinDetailsState;", "", "loading", "", "coinDetails", "Lcom/example/coinsapplication/domain/model/CoinDetails;", "erorr", "", "(ZLcom/example/coinsapplication/domain/model/CoinDetails;Ljava/lang/String;)V", "getCoinDetails", "()Lcom/example/coinsapplication/domain/model/CoinDetails;", "setCoinDetails", "(Lcom/example/coinsapplication/domain/model/CoinDetails;)V", "getErorr", "()Ljava/lang/String;", "setErorr", "(Ljava/lang/String;)V", "getLoading", "()Z", "setLoading", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class CoinDetailsState {
    private boolean loading;
    @org.jetbrains.annotations.Nullable()
    private com.example.coinsapplication.domain.model.CoinDetails coinDetails;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String erorr;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.coinsapplication.domain.model.CoinDetailsState copy(boolean loading, @org.jetbrains.annotations.Nullable()
    com.example.coinsapplication.domain.model.CoinDetails coinDetails, @org.jetbrains.annotations.NotNull()
    java.lang.String erorr) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CoinDetailsState() {
        super();
    }
    
    public CoinDetailsState(boolean loading, @org.jetbrains.annotations.Nullable()
    com.example.coinsapplication.domain.model.CoinDetails coinDetails, @org.jetbrains.annotations.NotNull()
    java.lang.String erorr) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.coinsapplication.domain.model.CoinDetails component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.coinsapplication.domain.model.CoinDetails getCoinDetails() {
        return null;
    }
    
    public final void setCoinDetails(@org.jetbrains.annotations.Nullable()
    com.example.coinsapplication.domain.model.CoinDetails p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErorr() {
        return null;
    }
    
    public final void setErorr(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}