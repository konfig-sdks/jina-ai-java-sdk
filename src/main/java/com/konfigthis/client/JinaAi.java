package com.konfigthis.client;

import com.konfigthis.client.api.BulkEmbeddingsApi;
import com.konfigthis.client.api.EmbeddingsApi;
import com.konfigthis.client.api.HealthApi;
import com.konfigthis.client.api.MultiEmbeddingsApi;
import com.konfigthis.client.api.RerankApi;

public class JinaAi {
    private ApiClient apiClient;
    public final BulkEmbeddingsApi bulkEmbeddings;
    public final EmbeddingsApi embeddings;
    public final HealthApi health;
    public final MultiEmbeddingsApi multiEmbeddings;
    public final RerankApi rerank;

    public JinaAi() {
        this(null);
    }

    public JinaAi(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.bulkEmbeddings = new BulkEmbeddingsApi(this.apiClient);
        this.embeddings = new EmbeddingsApi(this.apiClient);
        this.health = new HealthApi(this.apiClient);
        this.multiEmbeddings = new MultiEmbeddingsApi(this.apiClient);
        this.rerank = new RerankApi(this.apiClient);
    }

}
