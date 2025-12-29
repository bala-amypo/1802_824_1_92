@GetMapping
public List<PatternDetectionResult> getResults() {
    return service.getResults();
}

@GetMapping("/{id}")
public PatternDetectionResult getById(@PathVariable Long id) {
    return service.getById(id);
}
