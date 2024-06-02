USE [J5Shop]
GO
INSERT [dbo].[Categories] ([Id], [Name]) VALUES (N'l1  ', N'Loại 1')
GO
INSERT [dbo].[Categories] ([Id], [Name]) VALUES (N'l2  ', N'Loại 2')
GO
INSERT [dbo].[Categories] ([Id], [Name]) VALUES (N'l3  ', N'Loại 3')
GO
INSERT [dbo].[Categories] ([Id], [Name]) VALUES (N'l4  ', N'Loại 4')
GO
INSERT [dbo].[Categories] ([Id], [Name]) VALUES (N'l5  ', N'Loại 5')
GO
SET IDENTITY_INSERT [dbo].[Products] ON 
GO
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [CreatedDate], [Available], [CategoryId]) VALUES (3, N'Sản Phẩm 1', N'product.jpg', 200, CAST(N'2024-01-01' AS Date), 1, N'l1  ')
GO
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [CreatedDate], [Available], [CategoryId]) VALUES (4, N'Sản Phẩm 2', N'product.jpg', 300, CAST(N'2024-01-01' AS Date), 1, N'l1  ')
GO
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [CreatedDate], [Available], [CategoryId]) VALUES (5, N'Sản Phẩm 3', N'product.jpg', 400, CAST(N'2024-01-01' AS Date), 1, N'l2  ')
GO
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [CreatedDate], [Available], [CategoryId]) VALUES (6, N'Sản Phẩm 4', N'product.jpg', 100, CAST(N'2024-01-01' AS Date), 1, N'l3  ')
GO
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [CreatedDate], [Available], [CategoryId]) VALUES (7, N'Sản Phẩm 5', N'product.jpg', 500, CAST(N'2024-01-01' AS Date), 1, N'l3  ')
GO
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [CreatedDate], [Available], [CategoryId]) VALUES (8, N'Sản Phẩm 6', N'product.jpg', 80, CAST(N'2024-01-01' AS Date), 1, N'l2  ')
GO
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [CreatedDate], [Available], [CategoryId]) VALUES (9, N'Sản Phẩm 7', N'product.jpg', 130, CAST(N'2024-01-01' AS Date), 1, N'l3  ')
GO
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [CreatedDate], [Available], [CategoryId]) VALUES (10, N'Sản Phẩm 8', N'product.jpg', 220, CAST(N'2024-01-01' AS Date), 1, N'l5  ')
GO
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [CreatedDate], [Available], [CategoryId]) VALUES (11, N'Sản Phẩm 9', N'product.jpg', 460, CAST(N'2024-01-01' AS Date), 1, N'l3  ')
GO
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [CreatedDate], [Available], [CategoryId]) VALUES (12, N'Sản Phẩm 10', N'product.jpg', 380, CAST(N'2024-01-01' AS Date), 1, N'l2  ')
GO
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [CreatedDate], [Available], [CategoryId]) VALUES (13, N'Sản Phẩm 11', N'product.jpg', 260, CAST(N'2024-01-01' AS Date), 1, N'l4  ')
GO
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [CreatedDate], [Available], [CategoryId]) VALUES (14, N'Sản Phẩm 12', N'product.jpg', 440, CAST(N'2024-01-01' AS Date), 1, N'l5  ')
GO
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [CreatedDate], [Available], [CategoryId]) VALUES (16, N'Sản Phẩm 13', N'product.jpg', 360, CAST(N'2024-01-01' AS Date), 1, N'l5  ')
GO
SET IDENTITY_INSERT [dbo].[Products] OFF
GO
