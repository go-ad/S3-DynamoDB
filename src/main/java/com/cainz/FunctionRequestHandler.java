package com.cainz;
import io.micronaut.function.aws.MicronautRequestHandler;
import com.amazonaws.services.lambda.runtime.events.models.s3.S3EventNotification;
public class FunctionRequestHandler extends MicronautRequestHandler<S3EventNotification, Void> {
    @Override
    public Void execute(S3EventNotification input) {
        return null;
    }
}
