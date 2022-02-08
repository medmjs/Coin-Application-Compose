package com.example.coinsapplication.domain.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0013J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u000fH\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00c6\u0003J\t\u0010(\u001a\u00020\bH\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\fH\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u00c6\u0003J\u0083\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010/\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00101\u001a\u00020\fH\u00d6\u0001J\t\u00102\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015\u00a8\u00063"}, d2 = {"Lcom/example/coinsapplication/domain/model/CoinDetails;", "", "description", "", "id", "isActive", "", "links", "Lcom/example/coinsapplication/data/remote/dto/Links;", "message", "name", "rank", "", "symbol", "tags", "", "team", "Lcom/example/coinsapplication/data/remote/dto/Team;", "type", "(Ljava/lang/String;Ljava/lang/String;ZLcom/example/coinsapplication/data/remote/dto/Links;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getId", "()Z", "getLinks", "()Lcom/example/coinsapplication/data/remote/dto/Links;", "getMessage", "getName", "getRank", "()I", "getSymbol", "getTags", "()Ljava/util/List;", "getTeam", "getType", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class CoinDetails {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    private final boolean isActive = false;
    @org.jetbrains.annotations.NotNull()
    private final com.example.coinsapplication.data.remote.dto.Links links = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final int rank = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String symbol = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> tags = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.coinsapplication.data.remote.dto.Team> team = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.coinsapplication.domain.model.CoinDetails copy(@org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String id, boolean isActive, @org.jetbrains.annotations.NotNull()
    com.example.coinsapplication.data.remote.dto.Links links, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int rank, @org.jetbrains.annotations.NotNull()
    java.lang.String symbol, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> tags, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.coinsapplication.data.remote.dto.Team> team, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
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
    
    public CoinDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String id, boolean isActive, @org.jetbrains.annotations.NotNull()
    com.example.coinsapplication.data.remote.dto.Links links, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int rank, @org.jetbrains.annotations.NotNull()
    java.lang.String symbol, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> tags, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.coinsapplication.data.remote.dto.Team> team, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean isActive() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.coinsapplication.data.remote.dto.Links component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.coinsapplication.data.remote.dto.Links getLinks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getRank() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSymbol() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.coinsapplication.data.remote.dto.Team> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.coinsapplication.data.remote.dto.Team> getTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
}