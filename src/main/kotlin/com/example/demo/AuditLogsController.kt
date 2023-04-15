package com.example.demo

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

// issue https://youtrack.jetbrains.com/issue/KT-58005/K2-Unsupported-compile-time-value-BLOCK-for-Repeatable-annotations
@Validated
@RestController
@RequestMapping(
    value = [
        "/api/audit/logs",
    ],
    produces = [MediaType.APPLICATION_JSON_VALUE],
)
class AuditLogsController(
) {
    @GetMapping
    @Operation(operationId = "", summary = "", description = "", )
    @ApiResponses(
        value = [
            ApiResponse(
                responseCode = "200",
                description = "List of events of count `limit` occurring in queried time range after the cursor event",
            ),
            ApiResponse(
                responseCode = "400",
                description = "`limit` must be between 1 and 500",
                content = [
                    Content(schema = Schema(hidden = true)),
                ],
            ),
            ApiResponse(
                responseCode = "400",
                description = "`sorting` must be either 'asc' or 'desc'",
                content = [
                    Content(schema = Schema(hidden = true)),
                ],
            ),
            ApiResponse(
                responseCode = "403",
                description = "User is not authorized to read logs",
                content = [
                    Content(schema = Schema(hidden = true)),
                ],
            ),
            ApiResponse(
                responseCode = "404",
                description = "Organization not found",
                content = [
                    Content(schema = Schema(hidden = true)),
                ],
            ),
            ApiResponse(
                responseCode = "500",
                description = "Internal Server Error",
                content = [
                    Content(schema = Schema(hidden = true)),
                ],
            ),
        ],
    )
    fun getAuditLogs(): ResponseEntity<*> {
        TODO()
    }
}
