/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.generated.api.openapilocationvalidation;

import com.example.generated.model.openapilocationvalidation.BasicErrorResponse;
import com.example.generated.model.openapilocationvalidation.CredentialValidationResponse;
import com.example.generated.model.openapilocationvalidation.HealthCheckResponse;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-04T12:52:21.605030+05:30[Asia/Kolkata]")
@Validated
@Tag(name = "Authentication", description = "Endpoints to validate the credentials used for calling the Service Provider.")
public interface CredentialsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /credentials/validate : Validate credentials
     * This endpoint is used to validate the credentials used to call the Service Provider.
     *
     * @return Authentication succeeded. (status code 200)
     *         or Authentication failed. (status code 401)
     *         or Too many requests. (status code 429)
     *         or Unexpected error while processing request. (status code 500)
     *         or Service is unhealthy. (status code 503)
     */
    @Operation(
        operationId = "validateCredentials",
        summary = "Validate credentials",
        description = "This endpoint is used to validate the credentials used to call the Service Provider.",
        tags = { "Authentication" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Authentication succeeded.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CredentialValidationResponse.class))
            }),
            @ApiResponse(responseCode = "401", description = "Authentication failed.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CredentialValidationResponse.class))
            }),
            @ApiResponse(responseCode = "429", description = "Too many requests."),
            @ApiResponse(responseCode = "500", description = "Unexpected error while processing request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BasicErrorResponse.class))
            }),
            @ApiResponse(responseCode = "503", description = "Service is unhealthy.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = HealthCheckResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "apiKey"),
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/credentials/validate",
        produces = { "application/json" }
    )
    default ResponseEntity<CredentialValidationResponse> validateCredentials(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
