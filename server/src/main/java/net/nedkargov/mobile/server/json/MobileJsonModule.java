package net.nedkargov.mobile.server.json;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.module.SimpleModule;
import net.nedkargov.business.domain.ProjectDetails;
import net.nedkargov.business.domain.ProjectInterface;

public class MobileJsonModule extends SimpleModule {
        private static final long serialVersionUID = 1L;
        private static final Version VERSION = VersionUtil.parseVersion("1.0.0", "net.xdwonderer","");

        public MobileJsonModule() {
        super(VERSION);

		/*
         * MIX INS
		 */
        setMixInAnnotation(ProjectInterface.class, ProjectMixIns.ProjectMixIn.class);
        setMixInAnnotation(ProjectDetails.class, ProjectMixIns.ProjectDetailsMixIn.class);
    }
}