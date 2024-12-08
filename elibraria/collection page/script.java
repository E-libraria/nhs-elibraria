document.querySelectorAll('.back-button').forEach(button => {
    button.addEventListener('click', () => {
        window.history.back(); // Navigates to the previous page
    });
});


// Placeholder function for next button
document.querySelector('.next-button').addEventListener('click', () => {
    alert('Next page functionality');
});

