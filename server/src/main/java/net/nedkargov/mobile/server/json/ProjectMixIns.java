package net.nedkargov.mobile.server.json;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import net.nedkargov.business.domain.ProjectDetailsInterface;
import net.nedkargov.business.domain.ProjectInterface;

public class ProjectMixIns {

    @JsonTypeInfo(use = JsonTypeInfo.Id.MINIMAL_CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@type")
    public abstract class ProjectMixIn implements ProjectInterface {

        @Override
        @JsonProperty
        public abstract String getName();

        @Override
        @JsonProperty
        public abstract Integer getId();
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.MINIMAL_CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@type")
    public abstract class ProjectDetailsMixIn implements ProjectDetailsInterface {

        @Override
        @JsonProperty
        public abstract String getName();

        @Override
        @JsonProperty
        public abstract Integer getId();
    }
}
